/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DtTypeRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DtTypeRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DtTypeRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DocumentTypeRefObjectData noOpIn;

/**
 *
 * Constructor to create a   DtTypeRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DtTypeRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DocumentTypeRefObjectData noOpInIn) {
    super(id, context, "DtTypeRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DocumentTypeRef", DocumentTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "DocumentTypeRef").get("DocumentTypeRef"));
    }
  }
/**
 *
 * Sets the  DocumentTypeRef
 * @param noOpInIn DocumentTypeRefObjectData to set
 *
 */
  public void setDocumentTypeRef(DocumentTypeRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DocumentTypeRef passed into the constructor
 * @return Simulated response
 *
 */
  public DocumentTypeRefObjectData getDocumentTypeRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DocumentTypeRefObjectHelper.fromMap(inputMap, "DocumentTypeRef");
  }
}
