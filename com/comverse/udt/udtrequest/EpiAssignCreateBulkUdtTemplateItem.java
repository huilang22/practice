/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignCreateBulkUdtTemplateItem.java
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
 * Class used to create a EpiAssignCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiAssignCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiAssignObjectData EASSCreateIn;
/**
 *
 * Constructor to create a  EpiAssignCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiAssignCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectData EASSCreateInIn) {
    super(id, context, "EpiAssignCreate");
    EASSCreateIn = EASSCreateInIn;
  }

  public void translateToMap() {
    if (EASSCreateIn != null) {
      EASSCreateIn.resetFlags(true, true);
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(EASSCreateIn, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }


/**
 *
 * Sets the EpiAssign
 * @param EASSCreateInIn Value of the EASSCreateIn
 *
 */

  public void setEpiAssign(EpiAssignObjectData EASSCreateInIn) {
    EASSCreateIn = EASSCreateInIn;
  }

  public void translateFromMap() {
    EASSCreateIn = EpiAssignObjectHelper.fromMap(inputMap, "EpiAssign");
  }

/**
 *
 * Gets the EpiAssign
 * @return Value of the EpiAssign
 *
 */

  public EpiAssignObjectData getEpiAssign( ) {
    return EASSCreateIn;
  }

}
