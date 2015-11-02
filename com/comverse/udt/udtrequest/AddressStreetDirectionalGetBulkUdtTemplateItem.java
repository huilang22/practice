/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalGetBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetDirectionalGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetDirectionalGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetDirectionalObjectKeyData ASDGetIn;
/**
 *
 * Constructor to create a  AddressStreetDirectionalGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetDirectionalGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectKeyData ASDGetInIn) {
    super(id, context, "AddressStreetDirectionalGet");
    ASDGetIn = ASDGetInIn;
  }

  public void translateToMap() {
    if (ASDGetIn != null) {
      ASDGetIn.resetFlags(true, true);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectKeyHelper.toMap(ASDGetIn, new HashMap(), "AddressStreetDirectionalObjectKeyData").get("AddressStreetDirectionalObjectKeyData"));
    }
  }


/**
 *
 * Sets the AddressStreetDirectional
 * @param ASDGetInIn Value of the ASDGetIn
 *
 */

  public void setAddressStreetDirectional(AddressStreetDirectionalObjectKeyData ASDGetInIn) {
    ASDGetIn = ASDGetInIn;
  }

  public void translateFromMap() {
    ASDGetIn = AddressStreetDirectionalObjectKeyHelper.fromMap(inputMap, "AddressStreetDirectional");
  }

/**
 *
 * Gets the AddressStreetDirectional
 * @return Value of the AddressStreetDirectional
 *
 */

  public AddressStreetDirectionalObjectKeyData getAddressStreetDirectional( ) {
    return ASDGetIn;
  }

}
