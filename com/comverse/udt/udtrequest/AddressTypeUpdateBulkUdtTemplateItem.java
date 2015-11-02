/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AddressTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressTypeObjectData AddressTypeUpdateIn;
/**
 *
 * Constructor to create a  AddressTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectData AddressTypeUpdateInIn) {
    super(id, context, "AddressTypeUpdate");
    AddressTypeUpdateIn = AddressTypeUpdateInIn;
  }

  public void translateToMap() {
    if (AddressTypeUpdateIn != null) {
      AddressTypeUpdateIn.resetFlags(true, true);
      addInput("AddressType", AddressTypeObjectHelper.toMap(AddressTypeUpdateIn, new HashMap(), "AddressType").get("AddressType"));
    }
  }


/**
 *
 * Sets the AddressType
 * @param AddressTypeUpdateInIn Value of the AddressTypeUpdateIn
 *
 */

  public void setAddressType(AddressTypeObjectData AddressTypeUpdateInIn) {
    AddressTypeUpdateIn = AddressTypeUpdateInIn;
  }

  public void translateFromMap() {
    AddressTypeUpdateIn = AddressTypeObjectHelper.fromMap(inputMap, "AddressType");
  }

/**
 *
 * Gets the AddressType
 * @return Value of the AddressType
 *
 */

  public AddressTypeObjectData getAddressType( ) {
    return AddressTypeUpdateIn;
  }

}
