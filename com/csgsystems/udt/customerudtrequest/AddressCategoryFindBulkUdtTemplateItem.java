/*
 * Generated code DO NOT EDIT
 * Generated file: AddressCategoryFindBulkUdtTemplateItem.java
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
 * Class used to create a AddressCategoryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressCategoryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressCategoryObjectFilter AddressCategoryFindIn;
/**
 *
 * Constructor to create a  AddressCategoryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressCategoryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectFilter AddressCategoryFindInIn) {
    super(id, context, "AddressCategoryFind");
    AddressCategoryFindIn = AddressCategoryFindInIn;
  }

  public void translateToMap() {
    if (AddressCategoryFindIn != null) {
      Integer index =  AddressCategoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryFindIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }


/**
 *
 * Sets the AddressCategory
 * @param AddressCategoryFindInIn Value of the AddressCategoryFindIn
 *
 */

  public void setAddressCategory(AddressCategoryObjectFilter AddressCategoryFindInIn) {
    AddressCategoryFindIn = AddressCategoryFindInIn;
  }

  public void translateFromMap() {
    AddressCategoryFindIn = AddressCategoryObjectHelper.fromMapFilter(inputMap, "AddressCategory");
  }

/**
 *
 * Gets the AddressCategory
 * @return Value of the AddressCategory
 *
 */

  public AddressCategoryObjectFilter getAddressCategory( ) {
    return AddressCategoryFindIn;
  }

}
