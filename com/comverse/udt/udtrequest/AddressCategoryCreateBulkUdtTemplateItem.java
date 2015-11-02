/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryCreateBulkUdtTemplateItem.java
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
 * Class used to create a AddressCategoryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressCategoryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressCategoryObjectData AddressCategoryCreateIn;
/**
 *
 * Constructor to create a  AddressCategoryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressCategoryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectData AddressCategoryCreateInIn) {
    super(id, context, "AddressCategoryCreate");
    AddressCategoryCreateIn = AddressCategoryCreateInIn;
  }

  public void translateToMap() {
    if (AddressCategoryCreateIn != null) {
      AddressCategoryCreateIn.resetFlags(true, true);
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryCreateIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }


/**
 *
 * Sets the AddressCategory
 * @param AddressCategoryCreateInIn Value of the AddressCategoryCreateIn
 *
 */

  public void setAddressCategory(AddressCategoryObjectData AddressCategoryCreateInIn) {
    AddressCategoryCreateIn = AddressCategoryCreateInIn;
  }

  public void translateFromMap() {
    AddressCategoryCreateIn = AddressCategoryObjectHelper.fromMap(inputMap, "AddressCategory");
  }

/**
 *
 * Gets the AddressCategory
 * @return Value of the AddressCategory
 *
 */

  public AddressCategoryObjectData getAddressCategory( ) {
    return AddressCategoryCreateIn;
  }

}
