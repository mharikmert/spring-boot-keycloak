document.querySelector('#add-customer-btn').addEventListener('click', () => {
    const styleOfSaveButton = document.querySelector('#save-customer-btn').style;
    styleOfSaveButton.visibility = 'visible'
    console.log('add button clicked')

    const tbody = document.querySelector('table').getElementsByTagName('tbody')[0]

    const lastRow = tbody.rows[tbody.rows.length - 1]
    console.log(lastRow)

    //Node.outerText -> contains value of the node as string
    const newCellId = lastRow.cells[0]['outerText'];

    //new row reference
    const newRowRef = tbody.insertRow();

    //auto generated id
    const inCellId = document.createTextNode((parseInt(newCellId) + 1).toString());
    newRowRef.insertCell().appendChild(inCellId)

    newRowRef.insertCell().appendChild(createInputCell('nameCell'))
    newRowRef.insertCell().appendChild(createInputCell('addressCell'))
    newRowRef.insertCell().appendChild(createInputCell('serviceCell'))

})

createInputCell = (name) => {
    const newCell = document.createElement('input'); newCell.type = 'text'; newCell.name = name;
    return newCell;
}


//save new customers
document.querySelector('#save-customer-btn').addEventListener('click', () => {

})