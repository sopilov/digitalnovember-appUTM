async function getCompanies() {
    const companies = await fetch('api/companies/', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            }
        }
    );
    return companies.json();
}

getCompanies()
.then(response => {
    updateCompanies(response);
});

function updateCompanies(companies) {
    const selectBar = document.getElementById('_safe_id_21l2qfaeaae');
    selectBar.innerHTML = '';

    companies.forEach(company => {
        const option = document.createElement('option');
        option.value = company.id;
        option.innerHTML = company.name;
        selectBar.appendChild(option);
    });
}