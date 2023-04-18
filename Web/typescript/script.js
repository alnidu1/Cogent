var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var _this = this;
function area(l, w, shape) {
    if (shape === "r") {
        return l * w;
    }
    return l * w / 2;
}
var r = area(10, 4, "r");
var t = area(10, 4, "t");
var tri = {
    l: 10,
    w: 20,
    area: function () { return _this.w * _this.l; }
};
var Person = /** @class */ (function () {
    function Person() {
        this.fn = "";
        this.ln = "";
    }
    Person.prototype.get = function () {
        return this.fn + " " + this.ln;
    };
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.designation = "";
        return _this;
    }
    return Employee;
}(Person));
var e = new Employee();
e.fn = "test";
e.ln = "case";
e.designation = "1";
console.log(e.get());
console.log(e);
