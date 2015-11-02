/*
 * Generated code DO NOT EDIT
 * Generated file: AddressSecondaryUnitTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a AddressSecondaryUnitTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressSecondaryUnitTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressSecondaryUnitTypeObjectData ASUTCreateIn;
/**
 *
 * Constructor to create a  AddressSecondaryUnitTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressSecondaryUnitTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressSecondaryUnitTypeObjectData ASUTCreateInIn) {
    super(id, context, "AddressSecondaryUnitTypeCreate");
    ASUTCreateIn = ASUTCreateInIn;
  }

  public void translateToMap() {
    if (ASUTCreateIn != null) {
      ASUTCreateIn.resetFlags(true, true);
      addInput("AddressSecondaryUnitType", AddressSecondaryUnitTypeObjectHelper.toMap(ASUTCreateIn, new HashMap(), "AddressSecondaryUnitType").get("AddressSecondaryUnitType"));
    }
  }


/**
 *
 * Sets the AddressSecondaryUnitType
 * @param ASUTCreateInIn Value of the ASUTCreateIn
 *
 */

  public void setAddressSecondaryUnitType(AddressSecondaryUnitTypeObjectData ASUTCreateInIn) {
    ASUTCreateIn = ASUTCreateInIn;
  }

  public void translateFromMap() {
    ASUTCreateIn = AddressSecondaryUnitTypeObjectHelper.fromMap(inputMap, "AddressSecondaryUnitType");
  }

/**
 *
 * Gets the AddressSecondaryUnitType
 * @return Value of the AddressSecondaryUnitType
 *
 */

  public AddressSecondaryUnitTypeObjectData getAddressSecondaryUnitType( ) {
    return ASUTCreateIn;
  }

}
