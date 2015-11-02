/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a AddressStreetDirectionalCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetDirectionalCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetDirectionalObjectData ASDCreateIn;
/**
 *
 * Constructor to create a  AddressStreetDirectionalCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetDirectionalCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectData ASDCreateInIn) {
    super(id, context, "AddressStreetDirectionalCreate");
    ASDCreateIn = ASDCreateInIn;
  }

  public void translateToMap() {
    if (ASDCreateIn != null) {
      ASDCreateIn.resetFlags(true, true);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDCreateIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }


/**
 *
 * Sets the AddressStreetDirectional
 * @param ASDCreateInIn Value of the ASDCreateIn
 *
 */

  public void setAddressStreetDirectional(AddressStreetDirectionalObjectData ASDCreateInIn) {
    ASDCreateIn = ASDCreateInIn;
  }

  public void translateFromMap() {
    ASDCreateIn = AddressStreetDirectionalObjectHelper.fromMap(inputMap, "AddressStreetDirectional");
  }

/**
 *
 * Gets the AddressStreetDirectional
 * @return Value of the AddressStreetDirectional
 *
 */

  public AddressStreetDirectionalObjectData getAddressStreetDirectional( ) {
    return ASDCreateIn;
  }

}
