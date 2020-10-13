import React from 'react';
import './App.css';
import {Container, Row, Col} from 'reactstrap'
import Form from '../src/components/Form'
import List from '../src/components/List'
import {DroneContextProvider} from '../src/utils/Context'


export default ()=>{
  return(
    <DroneContextProvider>
      <Container>
            <Row>
                <Col md="12" className="col">
                  <h1 className="title"><strong>Rastreamento de Drones</strong></h1>
                  <hr className="hr"/>
                </Col>
                <Form/>
                <List/>
            </Row>
      </Container>
    </DroneContextProvider>  
  )
}