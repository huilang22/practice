/*
 * Generated code DO NOT EDIT
 * Generated file: AddressGeoAreaFindBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a AddressGeoAreaFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressGeoAreaFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AGAObjectFilter findIn;
/**
 *
 * Constructor to create a  AddressGeoAreaFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressGeoAreaFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AGAObjectFilter findInIn) {
    super(id, context, "AddressGeoAreaFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressGeoArea", AGAObjectHelper.toMap(findIn, new HashMap(), "AddressGeoArea").get("AddressGeoArea"));
    }
  }


/**
 *
 * Sets the AddressGeoArea
 * @param findInIn Value of the findIn
 *
 */

  public void setAddressGeoArea(AGAObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = AGAObjectHelper.fromMapFilter(inputMap, "AddressGeoArea");
  }

/**
 *
 * Gets the AddressGeoArea
 * @return Value of the AddressGeoArea
 *
 */

  public AGAObjectFilter getAddressGeoArea( ) {
    return findIn;
  }

}
