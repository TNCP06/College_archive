function generateFields() {
    const numFields = document.getElementById('numFields').value;
    const container = document.getElementById('fieldsContainer');
    container.innerHTML = ''; // Clear existing fields

    for (let i = 1; i <= numFields; i++) {
        container.innerHTML += `
            <div class="row mb-3">
                <div class="col-md-6">
                    <label for="name${i}" class="form-label">Name ${i}</label>
                    <input type="text" class="form-control input-box" id="name${i}" name="name[]" placeholder="First Name" required>
                </div>
                <div class="col-md-6">
                    <label for="lastName${i}" class="form-label">Last Name ${i}</label>
                    <input type="text" class="form-control input-box" id="lastName${i}" name="lastName[]" placeholder="Last Name" required>
                </div>
            </div>
        `;
    }
}