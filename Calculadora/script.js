let currentValue = '0';
let prevValue = '';
let operator = '';

function clearDisplay() {
    currentValue = '0';
    prevValue = '';
    operator = '';
    updateDisplay();
}

function appendValue(value) {
    if (currentValue === '0' && value !== '.') {
        currentValue = value;
    } else {
        currentValue += value;
    }
    updateDisplay();
}

function setOperator(op) {
    if (operator !== '') {
        calculate();
    }
    operator = op;
    prevValue = currentValue;
    currentValue = '0';
}

function calculate() {
    if (operator === '' || prevValue === '') return;
    switch (operator) {
        case '+':
            currentValue = (parseFloat(prevValue) + parseFloat(currentValue)).toString();
            break;
        case '-':
            currentValue = (parseFloat(prevValue) - parseFloat(currentValue)).toString();
            break;
        case '*':
            currentValue = (parseFloat(prevValue) * parseFloat(currentValue)).toString();
            break;
        case '/':
            if (currentValue === '0') {
                currentValue = 'Error';
            } else {
                currentValue = (parseFloat(prevValue) / parseFloat(currentValue)).toString();
            }
            break;
    }
    operator = '';
    prevValue = '';
    updateDisplay();
}

function updateDisplay() {
    const display = document.getElementById('display');
    display.textContent = currentValue;
}
