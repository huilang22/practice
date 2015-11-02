/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcGenreDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcGenreDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcGenreObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcGenreDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcGenreDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectData noOpInIn) {
    super(id, context, "CtcGenreDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(noOpIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
/**
 *
 * Sets the  CtcGenre
 * @param noOpInIn CtcGenreObjectData to set
 *
 */
  public void setCtcGenre(CtcGenreObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcGenre passed into the constructor
 * @return Simulated response
 *
 */
  public CtcGenreObjectData getCtcGenre() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcGenreObjectHelper.fromMap(inputMap, "CtcGenre");
  }
}
