import React from 'react';
import './App.css';
import {Container, Row, Col} from 'reactstrap'
import Form from '../src/components/Form'
import List from '../src/components/List'
import Map from '../src/components/Map'
import {DroneContextProvider} from '../src/utils/Context'


export default ()=>{
  return(
    <DroneContextProvider>
      <Container>
            <Row className="justify-content-center">
                <Col md="12">
                  <h1><strong>Rastreamento de Drones</strong></h1>
                  <hr className="hr"/>
                </Col>
                <Form/>
                <List/>
                <Map/>
            </Row>
      </Container>
    </DroneContextProvider>  
  )
}