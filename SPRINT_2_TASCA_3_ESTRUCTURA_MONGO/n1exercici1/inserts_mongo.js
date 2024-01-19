



    db.suppliers.insertOne({
        NIF: 123456789,
        brands: [
            { id_marca: 1, nom_marca: 'Brand1' },
            { id_marca: 2, nom_marca: 'Brand2' }
        ],
        adress_street: 'calle majadero',
        adress_num: 456,
        adress_floor: 1,
        adress_door: 101,
        adress_city: 'Gotham city',
        adress_postcode: 78901,
        adress_country: 'EEUU',
        phone: 987654321,
        fax: 123456789
    });
    db.employees.insertOne({
        name: 'John',
        last_name: 'Doe'
    });
    db.glasses.insertOne({
        id_suppliers: 'Supplier123',
        id_marca: 'BrandXYZ',
        glass_grad_r: 2.5,
        glass_grad_l: 2.0,
        type_mount: 'FullFrame',
        colour_mount: 'Black',
        colour_glass: 'Clear',
        price: 150,
        seller: 201
    });


    db.clients.insertOne({
        client_nom: 'Paco',
        client_postcode: 54321,
        client_phone: 876543210,
        client_mail: 'Paco@example.com',
        client_date: new Date(),
        client_has_glasses: 1,
        transaction: [
            { id_transaction: 1, id_seller: 101, id_glasses: 201 },
            { id_transaction: 2, id_seller: 102, id_glasses: 202 }
        ]
    });

