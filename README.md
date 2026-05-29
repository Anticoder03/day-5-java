# Simple Java OOP Examples

**Project Overview**
- **Description**: A small collection of Java classes demonstrating basic OOP concepts: encapsulation, constructors (no-arg, parameterized, copy), getters/setters, `toString()`, and simple driver programs.
- **Package**: `day5` (all classes declare `package day5;`).

**Files**
- **Employee.java**: [Employee.java](Employee.java#L1) — model class with fields, getters/setters, constructors, and `getEmployee()` method to print details.
- **EmployeeDriver.java**: [EmployeeDriver.java](EmployeeDriver.java#L1) — creates `Employee` instances, demonstrates mutating via methods and passing objects to helper methods.
- **Player.java**: [Player.java](Player.java#L1) — demonstrates no-arg, parameterized, and copy constructors; overrides `toString()`.
- **PlayerDriver.java**: [PlayerDriver.java](PlayerDriver.java#L1) — creates `Player` instances and prints them.
- **Student.java**: [Student.java](Student.java#L1) — encapsulated student model with `acceptStudent()` (reads from stdin) and `accesStudent()` to print values.
- **StudentDriver.java**: [StudentDriver.java](StudentDriver.java#L1) — shows setting fields and a `test()` method that mutates a `Student` object.

**How to Compile & Run**
- Recommended: run from the parent directory of this folder (so the `day5` package matches directory layout).

- Compile all classes from the project root:

```powershell
javac day5/*.java
```

- Run a driver (example `EmployeeDriver`):

```powershell
java day5.EmployeeDriver
```

- Alternative (if you're inside this `day5` directory):

```powershell
javac -d .. *.java
java -cp .. day5.EmployeeDriver
```

**Behavior Summary**
- `EmployeeDriver` shows creating objects with setters and with the parameterized constructor; helper methods modify salary and post.
- `Player` demonstrates default values, explicit values, and copying; note: copy constructor has a bug copying `mp` from `jno`.
- `Student` reads input via `Scanner` in `acceptStudent()` but the driver uses setters directly; `acceptStudent()` sets `outStationCandidate` to `false` by default.



---
