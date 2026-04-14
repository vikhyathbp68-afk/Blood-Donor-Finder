let donors = [];

function register() {
    let name = document.getElementById('name').value;
    let blood = document.getElementById('blood').value;
    let phone = document.getElementById('phone').value;

    donors.push({ name, blood, phone });
    alert("Registered!");
}

function search() {
    let blood = document.getElementById('searchBlood').value;
    let result = donors.filter(d => d.blood === blood);

    let list = document.getElementById('result');
    list.innerHTML = "";

    result.forEach(d => {
        let li = document.createElement('li');
        li.innerText = `${d.name} - ${d.phone}`;
        list.appendChild(li);
    });
}
