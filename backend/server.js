'use strict';

const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const config = require('./config');
const dotenv = require('dotenv');
dotenv.config();

const updateWeight= require('./controllers/baggageController');

const app = express();
app.use(cors());
app.use(bodyParser.json());

app.get('/', (req, res) => {
    res.send("Hello")
})
app.put('/bag', updateWeight);

app.listen(config.port, () => {
    console.log("Server running successfully at PORT: " + config.port);
})