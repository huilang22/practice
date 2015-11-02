/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a AddressSecondaryUnitTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressSecondaryUnitTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressSecondaryUnitTypeObjectFilter ASUTFindIn;
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressSecondaryUnitTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectFilter ASUTFindInIn) {
    super(id, context, "AddressSecondaryUnitTypeFind");
    ASUTFindIn = ASUTFindInIn;
  }

  public void translateToMap() {
    if (ASUTFindIn != null) {
      Integer index =  ASUTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTFindIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }


/**
 *
 * Sets the AddressSecondaryUnitType
 * @param ASUTFindInIn Value of the ASUTFindIn
 *
 */

  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectFilter ASUTFindInIn) {
    ASUTFindIn = ASUTFindInIn;
  }

  public void translateFromMap() {
    ASUTFindIn = AddressSecondaryUnitTypeObjectHelper.fromMapFilter(inputMap, "AddressSecondaryUnitType");
  }

/**
 *
 * Gets the AddressSecondaryUnitType
 * @return Value of the AddressSecondaryUnitType
 *
 */

  public AddressSecondaryUnitTypeObjectFilter getAddressSecondaryUnitType( ) {
    return ASUTFindIn;
  }

}
