/*
 * Generated code DO NOT EDIT
 * Generated file: AddressStreetDirectionalUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetDirectionalUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetDirectionalUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetDirectionalObjectData ASDUpdateIn;
/**
 *
 * Constructor to create a  AddressStreetDirectionalUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetDirectionalUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectData ASDUpdateInIn) {
    super(id, context, "AddressStreetDirectionalUpdate");
    ASDUpdateIn = ASDUpdateInIn;
  }

  public void translateToMap() {
    if (ASDUpdateIn != null) {
      ASDUpdateIn.resetFlags(true, true);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDUpdateIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }


/**
 *
 * Sets the AddressStreetDirectional
 * @param ASDUpdateInIn Value of the ASDUpdateIn
 *
 */

  public void setAddressStreetDirectional(AddressStreetDirectionalObjectData ASDUpdateInIn) {
    ASDUpdateIn = ASDUpdateInIn;
  }

  public void translateFromMap() {
    ASDUpdateIn = AddressStreetDirectionalObjectHelper.fromMap(inputMap, "AddressStreetDirectional");
  }

/**
 *
 * Gets the AddressStreetDirectional
 * @return Value of the AddressStreetDirectional
 *
 */

  public AddressStreetDirectionalObjectData getAddressStreetDirectional( ) {
    return ASDUpdateIn;
  }

}
