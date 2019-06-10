var Calculator = require('../../public/js/calculator.js')
// var assert = require('assert')


describe('calculator', function () {
  beforeEach(function () {
    calculator = new Calculator()
  });

  // write unit tests here in the form of "it should do something..."
  // it('it has a sample test', function(){
  //   assert.equal(true, true)
  // })

  test('should add 1 to 4', function(){
    calculator.previousTotal = 1;
    calculator.add(4);
    expect(calculator.runningTotal).toBe(5)
  });

  test('should subtract 4 from 7', function(){
    calculator.previousTotal = 7;
    calculator.subtract(4);
    expect(calculator.runningTotal).toBe(3)
  })

  test('should multiply 3 by 5', function(){
    calculator.previousTotal = 3;
    calculator.multiply(5);
    expect(calculator.runningTotal).toBe(15)
  })

  test('should divide 21 by 7', function(){
    calculator.previousTotal = 21;
    calculator.divide(7);
    expect(calculator.runningTotal).toBe(3)
  })

  test('concatenate multiple number button clicks', function(){
    calculator.numberClick(5);
    calculator.numberClick(5);
    expect(calculator.runningTotal).toBe(55)
  })

  test('chain multiple operations together', function(){
    calculator.numberClick(5);
    calculator.operatorClick('+');
    calculator.numberClick(5);
    calculator.operatorClick('*');
    calculator.numberClick(5);
    calculator.operatorClick('=');
    expect(calculator.runningTotal).toBe(50)
  })

  test('clear the running total without affecting the calculation', function(){
    calculator.numberClick(5);
    calculator.operatorClick('+');
    calculator.numberClick(5);
    calculator.clearClick();
    calculator.numberClick(1);
    calculator.operatorClick('=');
    expect(calculator.runningTotal).toBe(6)
  })



});
