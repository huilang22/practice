/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a AddressSecondaryUnitTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressSecondaryUnitTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressSecondaryUnitTypeObjectKeyData ASUTGetIn;
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressSecondaryUnitTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectKeyData ASUTGetInIn) {
    super(id, context, "AddressSecondaryUnitTypeGet");
    ASUTGetIn = ASUTGetInIn;
  }

  public void translateToMap() {
    if (ASUTGetIn != null) {
      ASUTGetIn.resetFlags(true, true);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectKeyHelper.toMap(ASUTGetIn, new HashMap(), "AddressSecondaryUnitTypeObjectKeyData").get("AddressSecondaryUnitTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the AddressSecondaryUnitType
 * @param ASUTGetInIn Value of the ASUTGetIn
 *
 */

  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectKeyData ASUTGetInIn) {
    ASUTGetIn = ASUTGetInIn;
  }

  public void translateFromMap() {
    ASUTGetIn = AddressSecondaryUnitTypeObjectKeyHelper.fromMap(inputMap, "AddressSecondaryUnitType");
  }

/**
 *
 * Gets the AddressSecondaryUnitType
 * @return Value of the AddressSecondaryUnitType
 *
 */

  public AddressSecondaryUnitTypeObjectKeyData getAddressSecondaryUnitType( ) {
    return ASUTGetIn;
  }

}
