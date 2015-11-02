/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a AddressTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressTypeObjectFilter AddressTypeFindIn;
/**
 *
 * Constructor to create a  AddressTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectFilter AddressTypeFindInIn) {
    super(id, context, "AddressTypeFind");
    AddressTypeFindIn = AddressTypeFindInIn;
  }

  public void translateToMap() {
    if (AddressTypeFindIn != null) {
      Integer index =  AddressTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeFindIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }


/**
 *
 * Sets the AddressType
 * @param AddressTypeFindInIn Value of the AddressTypeFindIn
 *
 */

  public void setAddressType(AddressTypeObjectFilter AddressTypeFindInIn) {
    AddressTypeFindIn = AddressTypeFindInIn;
  }

  public void translateFromMap() {
    AddressTypeFindIn = AddressTypeObjectHelper.fromMapFilter(inputMap, "AddressType");
  }

/**
 *
 * Gets the AddressType
 * @return Value of the AddressType
 *
 */

  public AddressTypeObjectFilter getAddressType( ) {
    return AddressTypeFindIn;
  }

}
