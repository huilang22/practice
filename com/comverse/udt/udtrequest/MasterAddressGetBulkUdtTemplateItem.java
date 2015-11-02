/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a MasterAddressGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectKeyData MasterAddressGetIn;
/**
 *
 * Constructor to create a  MasterAddressGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectKeyData MasterAddressGetInIn) {
    super(id, context, "MasterAddressGet");
    MasterAddressGetIn = MasterAddressGetInIn;
  }

  public void translateToMap() {
    if (MasterAddressGetIn != null) {
      MasterAddressGetIn.resetFlags(true, true);
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(MasterAddressGetIn, new HashMap(), "MasterAddressObjectKeyData").get("MasterAddressObjectKeyData"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param MasterAddressGetInIn Value of the MasterAddressGetIn
 *
 */

  public void setMasterAddress(MasterAddressObjectKeyData MasterAddressGetInIn) {
    MasterAddressGetIn = MasterAddressGetInIn;
  }

  public void translateFromMap() {
    MasterAddressGetIn = MasterAddressObjectKeyHelper.fromMap(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectKeyData getMasterAddress( ) {
    return MasterAddressGetIn;
  }

}
