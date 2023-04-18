"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.shape = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(code, name) {
        this.id = code;
        this.name = name;
    }
    Employee.prototype.showInfo = function () {
        console.log("emp id " + this.id + " name: " + this.name);
    };
    return Employee;
}());
exports.Employee = Employee;
var shape = /** @class */ (function () {
    function shape(l, w, s) {
        this.shape = s;
        this.length = l;
        this.width = w;
    }
    shape.prototype.calc = function () {
        if (this.shape == "r") {
            var a = this.length * this.width;
            console.log("Area of rec = " + a);
        }
        else {
            var a = this.length * this.width / 2;
            console.log("Areaof tri  = " + a);
        }
    };
    return shape;
}());
exports.shape = shape;
