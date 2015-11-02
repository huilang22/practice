/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalFindBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetDirectionalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetDirectionalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetDirectionalObjectFilter ASDFindIn;
/**
 *
 * Constructor to create a  AddressStreetDirectionalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetDirectionalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetDirectionalObjectFilter ASDFindInIn) {
    super(id, context, "AddressStreetDirectionalFind");
    ASDFindIn = ASDFindInIn;
  }

  public void translateToMap() {
    if (ASDFindIn != null) {
      Integer index =  ASDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressStreetDirectional", AddressStreetDirectionalObjectHelper.toMap(ASDFindIn, new HashMap(), "AddressStreetDirectional").get("AddressStreetDirectional"));
    }
  }


/**
 *
 * Sets the AddressStreetDirectional
 * @param ASDFindInIn Value of the ASDFindIn
 *
 */

  public void setAddressStreetDirectional(AddressStreetDirectionalObjectFilter ASDFindInIn) {
    ASDFindIn = ASDFindInIn;
  }

  public void translateFromMap() {
    ASDFindIn = AddressStreetDirectionalObjectHelper.fromMapFilter(inputMap, "AddressStreetDirectional");
  }

/**
 *
 * Gets the AddressStreetDirectional
 * @return Value of the AddressStreetDirectional
 *
 */

  public AddressStreetDirectionalObjectFilter getAddressStreetDirectional( ) {
    return ASDFindIn;
  }

}
