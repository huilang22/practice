/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EpiAssignUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiAssignUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiAssignObjectData EASSUpdateIn;
/**
 *
 * Constructor to create a  EpiAssignUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiAssignUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectData EASSUpdateInIn) {
    super(id, context, "EpiAssignUpdate");
    EASSUpdateIn = EASSUpdateInIn;
  }

  public void translateToMap() {
    if (EASSUpdateIn != null) {
      EASSUpdateIn.resetFlags(true, true);
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSUpdateIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }


/**
 *
 * Sets the EpiAssign
 * @param EASSUpdateInIn Value of the EASSUpdateIn
 *
 */

  public void setEpiAssign(EpiAssignObjectData EASSUpdateInIn) {
    EASSUpdateIn = EASSUpdateInIn;
  }

  public void translateFromMap() {
    EASSUpdateIn = EpiAssignObjectHelper.fromMap(inputMap, "EpiAssign");
  }

/**
 *
 * Gets the EpiAssign
 * @return Value of the EpiAssign
 *
 */

  public EpiAssignObjectData getEpiAssign( ) {
    return EASSUpdateIn;
  }

}
