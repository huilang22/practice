/*
 * Generated code DO NOT EDIT
 * Generated file: AddressTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a AddressTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressTypeObjectData AddressTypeCreateIn;
/**
 *
 * Constructor to create a  AddressTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectData AddressTypeCreateInIn) {
    super(id, context, "AddressTypeCreate");
    AddressTypeCreateIn = AddressTypeCreateInIn;
  }

  public void translateToMap() {
    if (AddressTypeCreateIn != null) {
      AddressTypeCreateIn.resetFlags(true, true);
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeCreateIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }


/**
 *
 * Sets the AddressType
 * @param AddressTypeCreateInIn Value of the AddressTypeCreateIn
 *
 */

  public void setAddressType(AddressTypeObjectData AddressTypeCreateInIn) {
    AddressTypeCreateIn = AddressTypeCreateInIn;
  }

  public void translateFromMap() {
    AddressTypeCreateIn = AddressTypeObjectHelper.fromMap(inputMap, "AddressType");
  }

/**
 *
 * Gets the AddressType
 * @return Value of the AddressType
 *
 */

  public AddressTypeObjectData getAddressType( ) {
    return AddressTypeCreateIn;
  }

}
