/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a MasterAddressExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectKeyData medfIn;
/**
 *
 * Constructor to create a  MasterAddressExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectKeyData medfInIn) {
    super(id, context, "MasterAddressExtendedDataFind");
    medfIn = medfInIn;
  }

  public void translateToMap() {
    if (medfIn != null) {
      medfIn.resetFlags(true, true);
      addInput("MasterAddress", MasterAddressObjectKeyHelper.toMap(medfIn, new HashMap(), "MasterAddressObjectKeyData").get("MasterAddressObjectKeyData"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param medfInIn Value of the medfIn
 *
 */

  public void setMasterAddress(MasterAddressObjectKeyData medfInIn) {
    medfIn = medfInIn;
  }

  public void translateFromMap() {
    medfIn = MasterAddressObjectKeyHelper.fromMap(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectKeyData getMasterAddress( ) {
    return medfIn;
  }

}
