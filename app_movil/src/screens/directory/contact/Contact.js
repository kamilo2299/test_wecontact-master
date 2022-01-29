import React, {Component} from 'react';
import {
  View, StyleSheet, TouchableOpacity, Image, Dimensions,
} from 'react-native';
import {connect} from 'react-redux';
import * as R from 'ramda';
import {
  Container,
  Content,
  Card,
  CardItem,
  Text,
  Fab,
  Left,
  Body,
  Right,
} from "native-base";
import {Entypo, MaterialCommunityIcons, Feather} from '@expo/vector-icons';
import { LinearGradient } from 'expo-linear-gradient';
import Spinner from 'react-native-loading-spinner-overlay';

import {REQUEST_STATUS} from "../../../RequestStatus";
import colors from '../../../../resources/styles/colors';

export default class Contact extends Component {

  constructor() {
    super();
    this.state = {
    }
  }

  componentDidMount() {

  }

  render() {

    return (
      <Container style={{backgroundColor:colors.bgDarkBlue}}>
      
      </Container>
    );
  }
}

var {height, width} = Dimensions.get('window');

const styles = StyleSheet.create({
  
});
