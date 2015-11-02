/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AddressSecondaryUnitTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressSecondaryUnitTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressSecondaryUnitTypeObjectData ASUTDeleteIn;
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressSecondaryUnitTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectData ASUTDeleteInIn) {
    super(id, context, "AddressSecondaryUnitTypeDelete");
    ASUTDeleteIn = ASUTDeleteInIn;
  }

  public void translateToMap() {
    if (ASUTDeleteIn != null) {
      ASUTDeleteIn.resetFlags(true, true);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the AddressSecondaryUnitType
 * @param ASUTDeleteInIn Value of the ASUTDeleteIn
 *
 */

  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectData ASUTDeleteInIn) {
    ASUTDeleteIn = ASUTDeleteInIn;
  }

  public void translateFromMap() {
    ASUTDeleteIn = AddressSecondaryUnitTypeObjectHelper.fromMap(inputMap, "AddressSecondaryUnitType");
  }

/**
 *
 * Gets the AddressSecondaryUnitType
 * @return Value of the AddressSecondaryUnitType
 *
 */

  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitType( ) {
    return ASUTDeleteIn;
  }

}
