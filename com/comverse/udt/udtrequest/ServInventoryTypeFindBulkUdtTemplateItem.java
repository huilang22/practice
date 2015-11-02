/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInventoryTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a ServInventoryTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServInventoryTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger AddressIdIn;
/**
 *
 * Constructor to create a  ServInventoryTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServInventoryTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger AddressIdInIn) {
    super(id, context, "ServInventoryTypeFind");
    AddressIdIn = AddressIdInIn;
  }

  public void translateToMap() {
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }


/**
 *
 * Sets the AddressIdIn
 * @param AddressIdInIn Value of the AddressIdIn
 *
 */

  public void setAddressIdIn(BigInteger AddressIdInIn) {
    AddressIdIn = AddressIdInIn;
  }

  public void translateFromMap() {
    AddressIdIn = (BigInteger)inputMap.get("AddressIdIn");
  }

/**
 *
 * Gets the AddressIdIn
 * @return Value of the AddressIdIn
 *
 */

  public BigInteger getAddressIdIn( ) {
    return AddressIdIn;
  }

}
