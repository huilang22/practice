/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetDirectionalDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetDirectionalDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetDirectionalObjectData ASDDeleteIn;
/**
 *
 * Constructor to create a  AddressStreetDirectionalDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetDirectionalDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectData ASDDeleteInIn) {
    super(id, context, "AddressStreetDirectionalDelete");
    ASDDeleteIn = ASDDeleteInIn;
  }

  public void translateToMap() {
    if (ASDDeleteIn != null) {
      ASDDeleteIn.resetFlags(true, true);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the AddressStreetDirectional
 * @param ASDDeleteInIn Value of the ASDDeleteIn
 *
 */

  public void setAddressStreetDirectional(AddressStreetDirectionalObjectData ASDDeleteInIn) {
    ASDDeleteIn = ASDDeleteInIn;
  }

  public void translateFromMap() {
    ASDDeleteIn = AddressStreetDirectionalObjectHelper.fromMap(inputMap, "AddressStreetDirectional");
  }

/**
 *
 * Gets the AddressStreetDirectional
 * @return Value of the AddressStreetDirectional
 *
 */

  public AddressStreetDirectionalObjectData getAddressStreetDirectional( ) {
    return ASDDeleteIn;
  }

}
