/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsFindBulkUdtTemplateItem.java
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
 * Class used to create a VoucherDefinitionsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherDefinitionsObjectFilter VouFIn;
/**
 *
 * Constructor to create a  VoucherDefinitionsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectFilter VouFInIn) {
    super(id, context, "VoucherDefinitionsFind");
    VouFIn = VouFInIn;
  }

  public void translateToMap() {
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouFIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }


/**
 *
 * Sets the VoucherDefinitions
 * @param VouFInIn Value of the VouFIn
 *
 */

  public void setVoucherDefinitions(VoucherDefinitionsObjectFilter VouFInIn) {
    VouFIn = VouFInIn;
  }

  public void translateFromMap() {
    VouFIn = VoucherDefinitionsObjectHelper.fromMapFilter(inputMap, "VoucherDefinitions");
  }

/**
 *
 * Gets the VoucherDefinitions
 * @return Value of the VoucherDefinitions
 *
 */

  public VoucherDefinitionsObjectFilter getVoucherDefinitions( ) {
    return VouFIn;
  }

}
