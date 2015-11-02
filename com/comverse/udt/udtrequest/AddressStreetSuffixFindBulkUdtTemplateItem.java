/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetSuffixFindBulkUdtTemplateItem.java
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
 * Class used to create a AddressStreetSuffixFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressStreetSuffixFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressStreetSuffixObjectFilter ASSFindIn;
/**
 *
 * Constructor to create a  AddressStreetSuffixFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressStreetSuffixFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressStreetSuffixObjectFilter ASSFindInIn) {
    super(id, context, "AddressStreetSuffixFind");
    ASSFindIn = ASSFindInIn;
  }

  public void translateToMap() {
    if (ASSFindIn != null) {
      Integer index =  ASSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressStreetSuffix", AddressStreetSuffixObjectHelper.toMap(ASSFindIn, new HashMap(), "AddressStreetSuffix").get("AddressStreetSuffix"));
    }
  }


/**
 *
 * Sets the AddressStreetSuffix
 * @param ASSFindInIn Value of the ASSFindIn
 *
 */

  public void setAddressStreetSuffix(AddressStreetSuffixObjectFilter ASSFindInIn) {
    ASSFindIn = ASSFindInIn;
  }

  public void translateFromMap() {
    ASSFindIn = AddressStreetSuffixObjectHelper.fromMapFilter(inputMap, "AddressStreetSuffix");
  }

/**
 *
 * Gets the AddressStreetSuffix
 * @return Value of the AddressStreetSuffix
 *
 */

  public AddressStreetSuffixObjectFilter getAddressStreetSuffix( ) {
    return ASSFindIn;
  }

}
