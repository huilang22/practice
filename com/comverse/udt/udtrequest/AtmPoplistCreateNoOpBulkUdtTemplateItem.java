/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AtmPoplistCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AtmPoplistCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AtmPoplistObjectData noOpIn;

/**
 *
 * Constructor to create a   AtmPoplistCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AtmPoplistCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectData noOpInIn) {
    super(id, context, "AtmPoplistCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(noOpIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
/**
 *
 * Sets the  AtmPoplist
 * @param noOpInIn AtmPoplistObjectData to set
 *
 */
  public void setAtmPoplist(AtmPoplistObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AtmPoplist passed into the constructor
 * @return Simulated response
 *
 */
  public AtmPoplistObjectData getAtmPoplist() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AtmPoplistObjectHelper.fromMap(inputMap, "AtmPoplist");
  }
}
