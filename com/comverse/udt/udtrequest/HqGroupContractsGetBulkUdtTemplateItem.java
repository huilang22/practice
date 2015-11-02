/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a HqGroupContractsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupContractsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupContractsObjectData HQGroupContractsgetIn;
/**
 *
 * Constructor to create a  HqGroupContractsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupContractsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsgetInIn) {
    super(id, context, "HqGroupContractsGet");
    HQGroupContractsgetIn = HQGroupContractsgetInIn;
  }

  public void translateToMap() {
    if (HQGroupContractsgetIn != null) {
      HQGroupContractsgetIn.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsgetIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }


/**
 *
 * Sets the HqGroupContracts
 * @param HQGroupContractsgetInIn Value of the HQGroupContractsgetIn
 *
 */

  public void setHqGroupContracts(HqGroupContractsObjectData HQGroupContractsgetInIn) {
    HQGroupContractsgetIn = HQGroupContractsgetInIn;
  }

  public void translateFromMap() {
    HQGroupContractsgetIn = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
  }

/**
 *
 * Gets the HqGroupContracts
 * @return Value of the HqGroupContracts
 *
 */

  public HqGroupContractsObjectData getHqGroupContracts( ) {
    return HQGroupContractsgetIn;
  }

}
