/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AddressSecondaryUnitTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressSecondaryUnitTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressSecondaryUnitTypeObjectData ASUTUpdateIn;
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressSecondaryUnitTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectData ASUTUpdateInIn) {
    super(id, context, "AddressSecondaryUnitTypeUpdate");
    ASUTUpdateIn = ASUTUpdateInIn;
  }

  public void translateToMap() {
    if (ASUTUpdateIn != null) {
      ASUTUpdateIn.resetFlags(true, true);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTUpdateIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }


/**
 *
 * Sets the AddressSecondaryUnitType
 * @param ASUTUpdateInIn Value of the ASUTUpdateIn
 *
 */

  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectData ASUTUpdateInIn) {
    ASUTUpdateIn = ASUTUpdateInIn;
  }

  public void translateFromMap() {
    ASUTUpdateIn = AddressSecondaryUnitTypeObjectHelper.fromMap(inputMap, "AddressSecondaryUnitType");
  }

/**
 *
 * Gets the AddressSecondaryUnitType
 * @return Value of the AddressSecondaryUnitType
 *
 */

  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitType( ) {
    return ASUTUpdateIn;
  }

}
