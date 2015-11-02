/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryGetBulkUdtTemplateItem.java
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
 * Class used to create a AddressCategoryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressCategoryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressCategoryObjectKeyData AddressCategoryGetIn;
/**
 *
 * Constructor to create a  AddressCategoryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressCategoryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectKeyData AddressCategoryGetInIn) {
    super(id, context, "AddressCategoryGet");
    AddressCategoryGetIn = AddressCategoryGetInIn;
  }

  public void translateToMap() {
    if (AddressCategoryGetIn != null) {
      AddressCategoryGetIn.resetFlags(true, true);
      addInput("AddressCategory", AddressCategoryObjectKeyHelper.toMap(AddressCategoryGetIn, new HashMap(), "AddressCategoryObjectKeyData").get("AddressCategoryObjectKeyData"));
    }
  }


/**
 *
 * Sets the AddressCategory
 * @param AddressCategoryGetInIn Value of the AddressCategoryGetIn
 *
 */

  public void setAddressCategory(AddressCategoryObjectKeyData AddressCategoryGetInIn) {
    AddressCategoryGetIn = AddressCategoryGetInIn;
  }

  public void translateFromMap() {
    AddressCategoryGetIn = AddressCategoryObjectKeyHelper.fromMap(inputMap, "AddressCategory");
  }

/**
 *
 * Gets the AddressCategory
 * @return Value of the AddressCategory
 *
 */

  public AddressCategoryObjectKeyData getAddressCategory( ) {
    return AddressCategoryGetIn;
  }

}
