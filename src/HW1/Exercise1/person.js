export const Person = (firstName, lastName, age) => {
    return {
        firstName,
        lastName,
        age,

    }
}

export const Professor = (firstName,lastName,age,role,level,chair) => {
    return {
        __proto__ : Person(firstName,lastName,age),
        role,
        level,
        chair,
        getDescription : () => {
            return this.__proto__.firstName + " " + this.__proto__.lastName + " " + this.chair;
        },
        getInfo : () => {
            return this.getDescription() + " " + this.role + " " + this.level;
        }
    }
}

export const HeadOfExaminationBoard = (firstName, lastName, age, role, level, chair) => {
    return {
        __proto__ : Professor(firstName, lastName, age, role, level, chair),
        getDescription : function() {
            return this.__proto__.__proto__.firstName + " " + this.__proto__.__proto__.lastName + " " + this.__proto__.chair + " " + "Head of Examination Board"
        },
        getInfo : function () {
            return this.getDescription() + " " + this.__proto__.role + " " + this.__proto__.level + " " + "Head of Examination Board";
        }
    }
}

export const HeadOfTheDepartment = (firstName, lastName, age, role, level, chair) => {
    return {
        __proto__ : Professor(firstName, lastName, age, role, level, chair),
        getDescription : function() {
            return this.__proto__.firstName + " " + this.__proto__.lastName + " " + this.__proto__.chair + " " + "Head of the Department"
        },
        getInfo : function() {
            return this.getDescription() + " " + this.__proto__.role + " " + this.__proto__.level + " " + "Head of the Deparment";
        }
    }
}