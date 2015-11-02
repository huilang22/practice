/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a AddressTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AddressTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AddressTypeObjectKeyData AddressTypeGetIn;
/**
 *
 * Constructor to create a  AddressTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AddressTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressTypeObjectKeyData AddressTypeGetInIn) {
    super(id, context, "AddressTypeGet");
    AddressTypeGetIn = AddressTypeGetInIn;
  }

  public void translateToMap() {
    if (AddressTypeGetIn != null) {
      AddressTypeGetIn.resetFlags(true, true);
      addInput("AddressType", AddressTypeObjectKeyHelper.toMap(AddressTypeGetIn, new HashMap(), "AddressTypeObjectKeyData").get("AddressTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the AddressType
 * @param AddressTypeGetInIn Value of the AddressTypeGetIn
 *
 */

  public void setAddressType(AddressTypeObjectKeyData AddressTypeGetInIn) {
    AddressTypeGetIn = AddressTypeGetInIn;
  }

  public void translateFromMap() {
    AddressTypeGetIn = AddressTypeObjectKeyHelper.fromMap(inputMap, "AddressType");
  }

/**
 *
 * Gets the AddressType
 * @return Value of the AddressType
 *
 */

  public AddressTypeObjectKeyData getAddressType( ) {
    return AddressTypeGetIn;
  }

}
