"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Emp = exports.age = void 0;
exports.age = 20;
var Emp = /** @class */ (function () {
    function Emp(code, name) {
        this.code = code;
        this.name = name;
    }
    Emp.prototype.display = function () {
        console.log("emp code " + this.code + " name: " + this.name);
    };
    return Emp;
}());
exports.Emp = Emp;
