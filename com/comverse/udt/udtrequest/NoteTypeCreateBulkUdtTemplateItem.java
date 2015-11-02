/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeObjectData NoteTypeCreateIn;
/**
 *
 * Constructor to create a  NoteTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectData NoteTypeCreateInIn) {
    super(id, context, "NoteTypeCreate");
    NoteTypeCreateIn = NoteTypeCreateInIn;
  }

  public void translateToMap() {
    if (NoteTypeCreateIn != null) {
      NoteTypeCreateIn.resetFlags(true, true);
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeCreateIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }


/**
 *
 * Sets the NoteType
 * @param NoteTypeCreateInIn Value of the NoteTypeCreateIn
 *
 */

  public void setNoteType(NoteTypeObjectData NoteTypeCreateInIn) {
    NoteTypeCreateIn = NoteTypeCreateInIn;
  }

  public void translateFromMap() {
    NoteTypeCreateIn = NoteTypeObjectHelper.fromMap(inputMap, "NoteType");
  }

/**
 *
 * Gets the NoteType
 * @return Value of the NoteType
 *
 */

  public NoteTypeObjectData getNoteType( ) {
    return NoteTypeCreateIn;
  }

}
