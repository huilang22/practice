/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AddressCategoryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressCategoryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressCategoryObjectData AddressCategoryUpdateIn;
/**
 *
 * Constructor to create a  AddressCategoryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressCategoryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressCategoryObjectData AddressCategoryUpdateInIn) {
    super(id, context, "AddressCategoryUpdate");
    AddressCategoryUpdateIn = AddressCategoryUpdateInIn;
  }

  public void translateToMap() {
    if (AddressCategoryUpdateIn != null) {
      AddressCategoryUpdateIn.resetFlags(true, true);
      addInput("AddressCategory", AddressCategoryObjectHelper.toMap(AddressCategoryUpdateIn, new HashMap(), "AddressCategory").get("AddressCategory"));
    }
  }


/**
 *
 * Sets the AddressCategory
 * @param AddressCategoryUpdateInIn Value of the AddressCategoryUpdateIn
 *
 */

  public void setAddressCategory(AddressCategoryObjectData AddressCategoryUpdateInIn) {
    AddressCategoryUpdateIn = AddressCategoryUpdateInIn;
  }

  public void translateFromMap() {
    AddressCategoryUpdateIn = AddressCategoryObjectHelper.fromMap(inputMap, "AddressCategory");
  }

/**
 *
 * Gets the AddressCategory
 * @return Value of the AddressCategory
 *
 */

  public AddressCategoryObjectData getAddressCategory( ) {
    return AddressCategoryUpdateIn;
  }

}
