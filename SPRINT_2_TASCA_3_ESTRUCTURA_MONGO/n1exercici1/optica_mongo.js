db.createCollection('suppliers', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'suppliers',
            required: ['NIF'],
            properties: {
                NIF: {
                    bsonType: 'int'
                },
                brands: {
                    bsonType: 'array',
                    items: {
                        title: 'object',
                        required: ['id_marca', 'nom_marca'],
                        properties: {
                            id_marca: {
                                bsonType: 'int'
                            },
                            nom_marca: {
                                bsonType: 'string'
                            }
                        }
                    }
                },
                adress_street: {
                    bsonType: 'string'
                },
                adress_num: {
                    bsonType: 'int'
                },
                adress_floor: {
                    bsonType: 'int'
                },
                adress_door: {
                    bsonType: 'int'
                },
                adress_city: {
                    bsonType: 'string'
                },
                adress_postcode: {
                    bsonType: 'int'
                },
                adress_country: {
                    bsonType: 'string'
                },
                phone: {
                    bsonType: 'int'
                },
                fax: {
                    bsonType: 'int'
                }
            }
        }
    }
});



db.createCollection('clients', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'clients',
            required: ['client_nom', 'client_postcode', 'client_phone', 'client_mail', 'client_date', 'client_has_glasses'],
            properties: {
                client_nom: {
                    bsonType: 'string'
                },
                client_postcode: {
                    bsonType: 'int'
                },
                client_phone: {
                    bsonType: 'int'
                },
                client_mail: {
                    bsonType: 'int'
                },
                client_date: {
                    bsonType: 'date'
                },
                client_has_glasses: {
                    bsonType: 'int'
                },
                transaction: {
                    bsonType: 'array',
                    items: {
                        title: 'object',
                        required: ['id_transaction'],
                        properties: {
                            id_transaction: {
                                bsonType: 'int'
                            },
                            id_seller: {
                                bsonType: 'int'
                            },
                            id_glasses: {
                                bsonType: 'int'
                            }
                        }
                    }
                }
            }
        }
    }
});

db.createCollection('suppliers', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'suppliers',
            required: ['NIF'],
            properties: {
                NIF: {
                    bsonType: 'int'
                },
                brands: {
                    bsonType: 'array',
                    items: {
                        title: 'object',
                        required: ['id_marca', 'nom_marca'],
                        properties: {
                            id_marca: {
                                bsonType: 'int'
                            },
                            nom_marca: {
                                bsonType: 'string'
                            }
                        }
                    }
                },
                adress_street: {
                    bsonType: 'string'
                },
                adress_num: {
                    bsonType: 'int'
                },
                adress_floor: {
                    bsonType: 'int'
                },
                adress_door: {
                    bsonType: 'int'
                },
                adress_city: {
                    bsonType: 'string'
                },
                adress_postcode: {
                    bsonType: 'int'
                },
                adress_country: {
                    bsonType: 'string'
                },
                phone: {
                    bsonType: 'int'
                },
                fax: {
                    bsonType: 'int'
                }
            }
        }
    }
});
db.createCollection('clients', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'clients',
            required: ['client_nom', 'client_postcode', 'client_phone', 'client_mail', 'client_date', 'client_has_glasses'],
            properties: {
                client_nom: {
                    bsonType: 'string'
                },
                client_postcode: {
                    bsonType: 'int'
                },
                client_phone: {
                    bsonType: 'int'
                },
                client_mail: {
                    bsonType: 'int'
                },
                client_date: {
                    bsonType: 'date'
                },
                client_has_glasses: {
                    bsonType: 'int'
                },
                transaction: {
                    bsonType: 'array',
                    items: {
                        title: 'object',
                        required: ['id_transaction'],
                        properties: {
                            id_transaction: {
                                bsonType: 'int'
                            },
                            id_seller: {
                                bsonType: 'int'
                            },
                            id_glasses: {
                                bsonType: 'int'
                            }
                        }
                    }
                }
            }
        }
    }
});
db.createCollection('glasses', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'glasses',
            required: ['id_suppliers', 'id_marca', 'glass_grad_r', 'glass_grad_l', 'type_mount', 'colour_mount', 'colour_glass', 'price', 'seller'],
            properties: {
                id_suppliers: {
                    bsonType: 'string'
                },
                id_marca: {
                    bsonType: 'string'
                },
                glass_grad_r: {
                    bsonType: 'double'
                },
                glass_grad_l: {
                    bsonType: 'double'
                },
                type_mount: {
                    bsonType: 'string'
                },
                colour_mount: {
                    bsonType: 'string'
                },
                colour_glass: {
                    bsonType: 'string'
                },
                price: {
                    bsonType: 'double'
                },
                seller: {
                    bsonType: 'int'
                }
            }
        }
    }
});

db.createCollection('employees', {
    validator: {
        $jsonSchema: {
            bsonType: 'object',
            title: 'employees',
            required: ['name', 'last_name'],
            properties: {
                name: {
                    bsonType: 'string'
                },
                last_name: {
                    bsonType: 'string'
                }
            }
        }
    }
});

