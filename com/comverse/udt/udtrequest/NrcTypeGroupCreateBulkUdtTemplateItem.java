/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a NrcTypeGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTypeGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTypeGroupObjectData NTGCrIn;
/**
 *
 * Constructor to create a  NrcTypeGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTypeGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectData NTGCrInIn) {
    super(id, context, "NrcTypeGroupCreate");
    NTGCrIn = NTGCrInIn;
  }

  public void translateToMap() {
    if (NTGCrIn != null) {
      NTGCrIn.resetFlags(true, true);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGCrIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }


/**
 *
 * Sets the NrcTypeGroup
 * @param NTGCrInIn Value of the NTGCrIn
 *
 */

  public void setNrcTypeGroup(NrcTypeGroupObjectData NTGCrInIn) {
    NTGCrIn = NTGCrInIn;
  }

  public void translateFromMap() {
    NTGCrIn = NrcTypeGroupObjectHelper.fromMap(inputMap, "NrcTypeGroup");
  }

/**
 *
 * Gets the NrcTypeGroup
 * @return Value of the NrcTypeGroup
 *
 */

  public NrcTypeGroupObjectData getNrcTypeGroup( ) {
    return NTGCrIn;
  }

}
