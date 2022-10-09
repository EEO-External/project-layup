'use strict';

const firebase = require('../db');
const firestore = firebase.firestore();


const updateWeight = async (req, res, next) => {
    try {
        const data = req.body;
        await firestore.collection('bags').doc().update({currWeightInPouds: data});
        console.log(data);
        res.status(200).send(data);

    } catch (e) {
        res.status(400).send(e.message);
    }
}

module.exports = updateWeight;
