/*
 * Generated code DO NOT EDIT
 * Generated file: GeocodeComponentsFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GeocodeComponentsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeocodeComponentsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String City;
  protected String County;
  protected String State;
/**
 *
 * Constructor to create a  GeocodeComponentsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeocodeComponentsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, String CityIn, String CountyIn, String StateIn) {
    super(id, context, "GeocodeComponentsFind");
    City = CityIn;
    County = CountyIn;
    State = StateIn;
  }

  public void translateToMap() {
    if (City != null) {
      addInput("City", City);
    }
    if (County != null) {
      addInput("County", County);
    }
    if (State != null) {
      addInput("State", State);
    }
  }


/**
 *
 * Sets the City
 * @param CityIn Value of the City
 *
 */

  public void setCity(String CityIn) {
    City = CityIn;
  }

/**
 *
 * Sets the County
 * @param CountyIn Value of the County
 *
 */

  public void setCounty(String CountyIn) {
    County = CountyIn;
  }

/**
 *
 * Sets the State
 * @param StateIn Value of the State
 *
 */

  public void setState(String StateIn) {
    State = StateIn;
  }

  public void translateFromMap() {
    City = (String)inputMap.get("City");
    County = (String)inputMap.get("County");
    State = (String)inputMap.get("State");
  }

/**
 *
 * Gets the City
 * @return Value of the City
 *
 */

  public String getCity( ) {
    return City;
  }

/**
 *
 * Gets the County
 * @return Value of the County
 *
 */

  public String getCounty( ) {
    return County;
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public String getState( ) {
    return State;
  }

}
