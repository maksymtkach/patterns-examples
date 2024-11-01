// Модуль Config створює єдиний екземпляр об'єкта конфігурації
const Config = (function () {
    let instance;

    function createInstance() {
        const object = {
            databaseURL: "https://example.com",
            maxTables: 50,
        };
        return object;
    }

    return {
        getInstance: function () {
            if (!instance) {
                instance = createInstance();
            }
            return instance;
        },
    };
})();

const config = Config.getInstance();
console.log(config); // { databaseURL: "https://example.com", maxTables: 50 }
