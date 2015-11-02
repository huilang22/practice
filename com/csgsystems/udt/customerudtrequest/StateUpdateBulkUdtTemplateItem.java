/*
 * Generated code DO NOT EDIT
 * Generated file: StateUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a StateUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class StateUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StateObjectData STUpdateIn;
  protected StateObjectFilter STUpdateFilter;
  protected StateObjectData STUpdateGet;
/**
 *
 * Constructor to create a  StateUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StateUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, StateObjectData STUpdateInIn, StateObjectFilter STUpdateFilterIn, StateObjectData STUpdateGetIn) {
    super(id, context, "StateUpdate");
    STUpdateIn = STUpdateInIn;
    STUpdateFilter = STUpdateFilterIn;
    STUpdateGet = STUpdateGetIn;
  }

  public void translateToMap() {
    if (STUpdateIn != null) {
      STUpdateIn.resetFlags(true, true);
      addInput("State", StateObjectHelper.toMap(STUpdateIn, new HashMap(), "State").get("State"));
    }
    if (STUpdateFilter != null) {
      Integer index =  STUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("STUpdateFilter", StateObjectHelper.toMap(STUpdateFilter, new HashMap(), "State").get("State"));
    }
    if (STUpdateGet != null) {
      STUpdateGet.resetFlags(true, true);
      addInput("STUpdateGet", StateObjectHelper.toMap(STUpdateGet, new HashMap(), "State").get("State"));
    }
  }


/**
 *
 * Sets the State
 * @param STUpdateInIn Value of the STUpdateIn
 *
 */

  public void setState(StateObjectData STUpdateInIn) {
    STUpdateIn = STUpdateInIn;
  }

/**
 *
 * Sets the STUpdateFilter
 * @param STUpdateFilterIn Value of the STUpdateFilter
 *
 */

  public void setSTUpdateFilter(StateObjectFilter STUpdateFilterIn) {
    STUpdateFilter = STUpdateFilterIn;
  }

/**
 *
 * Sets the STUpdateGet
 * @param STUpdateGetIn Value of the STUpdateGet
 *
 */

  public void setSTUpdateGet(StateObjectData STUpdateGetIn) {
    STUpdateGet = STUpdateGetIn;
  }

  public void translateFromMap() {
    STUpdateIn = StateObjectHelper.fromMap(inputMap, "State");
    STUpdateFilter = StateObjectHelper.fromMapFilter(inputMap, "STUpdateFilter");
    STUpdateGet = StateObjectHelper.fromMap(inputMap, "STUpdateGet");
  }

/**
 *
 * Gets the State
 * @return Value of the State
 *
 */

  public StateObjectData getState( ) {
    return STUpdateIn;
  }

/**
 *
 * Gets the STUpdateFilter
 * @return Value of the STUpdateFilter
 *
 */

  public StateObjectFilter getSTUpdateFilter( ) {
    return STUpdateFilter;
  }

/**
 *
 * Gets the STUpdateGet
 * @return Value of the STUpdateGet
 *
 */

  public StateObjectData getSTUpdateGet( ) {
    return STUpdateGet;
  }

}
